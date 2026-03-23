import React, { useState, useEffect } from 'react'
import { UserPlus, Loader, AlertCircle } from 'lucide-react'
import { employeeAPI } from '../services/api'
import EmployeeCard from './EmployeeCard'
import EmployeeModal from './EmployeeModal'
import SearchBar from './SearchBar'

const EmployeeList = () => {
    const [employees, setEmployees] = useState([])
    const [filteredEmployees, setFilteredEmployees] = useState([])
    const [loading, setLoading] = useState(true)
    const [error, setError] = useState(null)
    const [isModalOpen, setIsModalOpen] = useState(false)
    const [editingEmployee, setEditingEmployee] = useState(null)
    const [searchTerm, setSearchTerm] = useState('')

    useEffect(() => {
        fetchEmployees()
    }, [])

    const normalizeEmployee = (employee) => ({
        ...employee,
        name: employee?.name ?? '',
        email: employee?.email ?? '',
        mobile: employee?.mobile ?? '',
        role: employee?.role ?? 'EMPLOYEE',
        salary: employee?.salary === null || employee?.salary === undefined || employee?.salary === ''
            ? null
            : Number(employee.salary),
    })

    const filterEmployees = (list, term) => {
        const query = term.trim().toLowerCase()
        if (!query) {
            return list
        }

        return list.filter((emp) => {
            const searchableValues = [
                emp.name,
                emp.email,
                emp.mobile,
                emp.role,
                String(emp.id ?? ''),
                emp.salary === null || Number.isNaN(emp.salary) ? '' : String(emp.salary),
            ]

            return searchableValues.some((value) =>
                String(value).toLowerCase().includes(query)
            )
        })
    }

    const fetchEmployees = async () => {
        try {
            setLoading(true)
            const response = await employeeAPI.getAll()
            const normalized = Array.isArray(response.data)
                ? response.data.map(normalizeEmployee)
                : []

            setEmployees(normalized)
            setFilteredEmployees(filterEmployees(normalized, searchTerm))
            setError(null)
        } catch (err) {
            setError('Failed to load employees. Please make sure the backend server is running on http://localhost:8090')
            console.error(err)
        } finally {
            setLoading(false)
        }
    }

    const handleSearch = (term) => {
        setSearchTerm(term)
        setFilteredEmployees(filterEmployees(employees, term))
    }

    const handleAddClick = () => {
        setEditingEmployee(null)
        setIsModalOpen(true)
    }

    const handleEditClick = (employee) => {
        setEditingEmployee(employee)
        setIsModalOpen(true)
    }

    const handleSaveEmployee = async (formData) => {
        try {
            if (editingEmployee) {
                await employeeAPI.update(editingEmployee.id, formData)
            } else {
                await employeeAPI.create(formData)
            }
            await fetchEmployees()
            setIsModalOpen(false)
            setEditingEmployee(null)
        } catch (err) {
            setError('Failed to save employee. ' + (err.response?.data?.message || ''))
            console.error(err)
        }
    }

    const handleDeleteEmployee = async (id) => {
        if (window.confirm('Are you sure you want to delete this employee?')) {
            try {
                await employeeAPI.delete(id)
                await fetchEmployees()
            } catch (err) {
                setError('Failed to delete employee. ' + (err.response?.data?.message || ''))
                console.error(err)
            }
        }
    }

    return (
        <div className="min-h-screen bg-gradient-to-br from-blue-50 to-indigo-100 p-6 sm:p-8">
            <div className="max-w-6xl mx-auto">
                {/* Header */}
                <div className="mb-8">
                    <div className="flex flex-col sm:flex-row justify-between items-start sm:items-center gap-4">
                        <div>
                            <h1 className="text-4xl font-bold text-gray-900">Employee Management</h1>
                            <p className="text-gray-600 mt-2">Manage your company employees efficiently</p>
                        </div>
                        <button
                            onClick={handleAddClick}
                            className="flex items-center gap-2 px-6 py-3 bg-blue-600 text-white rounded-lg hover:bg-blue-700 font-medium shadow-lg hover:shadow-xl transition-all"
                        >
                            <UserPlus size={20} />
                            Add Employee
                        </button>
                    </div>
                </div>

                {/* Search Bar */}
                <div className="mb-6">
                    <SearchBar onSearch={handleSearch} />
                </div>

                {/* Error Message */}
                {error && (
                    <div className="mb-6 p-4 bg-red-50 border border-red-200 rounded-lg flex items-start gap-3">
                        <AlertCircle className="text-red-600 mt-0.5" size={20} />
                        <div>
                            <h3 className="font-semibold text-red-900">Error</h3>
                            <p className="text-red-700 text-sm">{error}</p>
                        </div>
                    </div>
                )}

                {/* Loading State */}
                {loading ? (
                    <div className="flex items-center justify-center py-12">
                        <Loader className="animate-spin text-blue-600" size={32} />
                        <span className="ml-3 text-gray-600">Loading employees...</span>
                    </div>
                ) : (
                    <>
                        {/* Employee Grid */}
                        {filteredEmployees.length > 0 ? (
                            <div className="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-6">
                                {filteredEmployees.map(employee => (
                                    <EmployeeCard
                                        key={employee.id}
                                        employee={employee}
                                        onEdit={handleEditClick}
                                        onDelete={handleDeleteEmployee}
                                    />
                                ))}
                            </div>
                        ) : (
                            <div className="text-center py-12">
                                <UserPlus className="mx-auto text-gray-400 mb-3" size={48} />
                                <h3 className="text-lg font-semibold text-gray-900">No employees found</h3>
                                <p className="text-gray-600 mt-1">
                                    {searchTerm ? 'Try adjusting your search criteria' : 'Get started by adding your first employee'}
                                </p>
                            </div>
                        )}

                        {/* Stats Footer */}
                        {filteredEmployees.length > 0 && (
                            <div className="mt-8 pt-6 border-t border-gray-300 text-center">
                                <p className="text-gray-700">
                                    <span className="font-bold text-blue-600">{filteredEmployees.length}</span> employee{filteredEmployees.length !== 1 ? 's' : ''} displayed
                                    {searchTerm && ` (${employees.length} total)`}
                                </p>
                            </div>
                        )}
                    </>
                )}
            </div>

            {/* Modal */}
            <EmployeeModal
                isOpen={isModalOpen}
                onClose={() => {
                    setIsModalOpen(false)
                    setEditingEmployee(null)
                }}
                onSave={handleSaveEmployee}
                employee={editingEmployee}
            />
        </div>
    )
}

export default EmployeeList
