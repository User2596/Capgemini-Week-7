import axios from 'axios'

const API_BASE_URL = import.meta.env.VITE_API_BASE_URL || ''

const api = axios.create({
    baseURL: API_BASE_URL,
    headers: {
        'Content-Type': 'application/json',
    },
})

export const employeeAPI = {
    getAll: () => api.get('/employees'),
    getById: (id) => api.get(`/employees/${id}`),
    create: (employee) => api.post('/employees', employee),
    update: (id, employee) => api.patch(`/employees/${id}`, employee),
    delete: (id) => api.delete(`/employees/${id}`),
    searchByEmail: (email) => api.get(`/employees/${email}`),
    searchByName: (name) => api.get(`/employees/${name}`),
    sortBySalary: () => api.get('/employees/sorted'),
}

export default api
