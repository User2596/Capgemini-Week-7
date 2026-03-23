import React from 'react'
import { Trash2, Edit, Mail, Phone, DollarSign } from 'lucide-react'

const EmployeeCard = ({ employee, onEdit, onDelete }) => {
    const getRoleColor = (role) => {
        const colors = {
            'MANAGER': 'bg-purple-100 text-purple-800',
            'EMPLOYEE': 'bg-blue-100 text-blue-800'
        }
        return colors[role] || 'bg-gray-100 text-gray-800'
    }

    const formatSalary = (salary) => {
        if (salary === null || salary === undefined || Number.isNaN(Number(salary))) {
            return 'Not available'
        }

        return Number(salary).toLocaleString('en-US', {
            style: 'currency',
            currency: 'USD',
            maximumFractionDigits: 2,
        })
    }

    return (
        <div className="bg-white rounded-lg shadow-md hover:shadow-lg transition-shadow duration-300 overflow-hidden">
            <div className="p-6">
                <div className="flex justify-between items-start mb-4">
                    <div>
                        <h3 className="text-lg font-bold text-gray-900">{employee.name}</h3>
                        <span className={`inline-block px-3 py-1 rounded-full text-sm font-medium mt-2 ${getRoleColor(employee.role)}`}>
                            {employee.role || 'EMPLOYEE'}
                        </span>
                    </div>
                    <div className="flex gap-2">
                        <button
                            onClick={() => onEdit(employee)}
                            className="p-2 text-blue-600 hover:bg-blue-50 rounded-lg transition-colors"
                            title="Edit"
                        >
                            <Edit size={18} />
                        </button>
                        <button
                            onClick={() => onDelete(employee.id)}
                            className="p-2 text-red-600 hover:bg-red-50 rounded-lg transition-colors"
                            title="Delete"
                        >
                            <Trash2 size={18} />
                        </button>
                    </div>
                </div>

                <div className="space-y-3 text-sm">
                    <div className="flex items-center gap-3 text-gray-600">
                        <Mail size={16} className="text-blue-500" />
                        <span>{employee.email}</span>
                    </div>
                    <div className="flex items-center gap-3 text-gray-600">
                        <Phone size={16} className="text-green-500" />
                        <span>{employee.mobile}</span>
                    </div>
                    <div className="flex items-center gap-3 text-gray-600">
                        <DollarSign size={16} className="text-yellow-500" />
                        <span className="font-semibold">{formatSalary(employee.salary)}</span>
                    </div>
                </div>
            </div>
        </div>
    )
}

export default EmployeeCard
