import React, { useEffect, useState } from 'react'
import { X } from 'lucide-react'

const EmployeeModal = ({ isOpen, onClose, onSave, employee = null }) => {
    const initialFormData = employee || {
        name: '',
        email: '',
        mobile: '',
        role: 'EMPLOYEE',
        salary: ''
    }

    const [formData, setFormData] = useState(initialFormData)

    const [errors, setErrors] = useState({})

    useEffect(() => {
        setFormData(employee || {
            name: '',
            email: '',
            mobile: '',
            role: 'EMPLOYEE',
            salary: ''
        })
        setErrors({})
    }, [employee, isOpen])

    const validateForm = () => {
        const newErrors = {}
        if (!formData.name) newErrors.name = 'Name is required'
        if (!formData.email) newErrors.email = 'Email is required'
        if (!/^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(formData.email)) newErrors.email = 'Invalid email format'
        if (!formData.mobile) newErrors.mobile = 'Mobile is required'
        if (!formData.salary) newErrors.salary = 'Salary is required'
        if (isNaN(formData.salary)) newErrors.salary = 'Salary must be a number'
        setErrors(newErrors)
        return Object.keys(newErrors).length === 0
    }

    const handleChange = (e) => {
        const { name, value } = e.target
        setFormData(prev => ({
            ...prev,
            [name]: name === 'salary'
                ? (value === '' ? '' : Number(value))
                : value
        }))
    }

    const handleSubmit = (e) => {
        e.preventDefault()
        if (validateForm()) {
            onSave(formData)
        }
    }

    if (!isOpen) return null

    return (
        <div className="fixed inset-0 bg-black bg-opacity-50 flex items-center justify-center z-50">
            <div className="bg-white rounded-lg shadow-xl max-w-md w-full mx-4">
                <div className="flex justify-between items-center p-6 border-b">
                    <h2 className="text-xl font-bold text-gray-900">
                        {employee ? 'Edit Employee' : 'Add New Employee'}
                    </h2>
                    <button onClick={onClose} className="text-gray-500 hover:text-gray-700">
                        <X size={20} />
                    </button>
                </div>

                <form onSubmit={handleSubmit} className="p-6">
                    <div className="space-y-4">
                        <div>
                            <label className="block text-sm font-medium text-gray-700">Name</label>
                            <input
                                type="text"
                                name="name"
                                value={formData.name}
                                onChange={handleChange}
                                className={`mt-1 w-full px-3 py-2 border rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-500 ${errors.name ? 'border-red-500' : 'border-gray-300'
                                    }`}
                            />
                            {errors.name && <p className="mt-1 text-sm text-red-500">{errors.name}</p>}
                        </div>

                        <div>
                            <label className="block text-sm font-medium text-gray-700">Email</label>
                            <input
                                type="email"
                                name="email"
                                value={formData.email}
                                onChange={handleChange}
                                className={`mt-1 w-full px-3 py-2 border rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-500 ${errors.email ? 'border-red-500' : 'border-gray-300'
                                    }`}
                            />
                            {errors.email && <p className="mt-1 text-sm text-red-500">{errors.email}</p>}
                        </div>

                        <div>
                            <label className="block text-sm font-medium text-gray-700">Mobile</label>
                            <input
                                type="text"
                                name="mobile"
                                value={formData.mobile}
                                onChange={handleChange}
                                className={`mt-1 w-full px-3 py-2 border rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-500 ${errors.mobile ? 'border-red-500' : 'border-gray-300'
                                    }`}
                            />
                            {errors.mobile && <p className="mt-1 text-sm text-red-500">{errors.mobile}</p>}
                        </div>

                        <div>
                            <label className="block text-sm font-medium text-gray-700">Role</label>
                            <select
                                name="role"
                                value={formData.role}
                                onChange={handleChange}
                                className="mt-1 w-full px-3 py-2 border border-gray-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-500"
                            >
                                <option value="MANAGER">Manager</option>
                                <option value="EMPLOYEE">Employee</option>
                            </select>
                        </div>

                        <div>
                            <label className="block text-sm font-medium text-gray-700">Salary</label>
                            <input
                                type="number"
                                name="salary"
                                value={formData.salary}
                                onChange={handleChange}
                                step="0.01"
                                className={`mt-1 w-full px-3 py-2 border rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-500 ${errors.salary ? 'border-red-500' : 'border-gray-300'
                                    }`}
                            />
                            {errors.salary && <p className="mt-1 text-sm text-red-500">{errors.salary}</p>}
                        </div>
                    </div>

                    <div className="flex gap-3 mt-6">
                        <button
                            type="button"
                            onClick={onClose}
                            className="flex-1 px-4 py-2 text-gray-700 border border-gray-300 rounded-lg hover:bg-gray-50 font-medium"
                        >
                            Cancel
                        </button>
                        <button
                            type="submit"
                            className="flex-1 px-4 py-2 bg-blue-600 text-white rounded-lg hover:bg-blue-700 font-medium"
                        >
                            Save
                        </button>
                    </div>
                </form>
            </div>
        </div>
    )
}

export default EmployeeModal
