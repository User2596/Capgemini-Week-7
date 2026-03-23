import React, { useState } from 'react'
import { Search } from 'lucide-react'

const SearchBar = ({ onSearch }) => {
    const [searchTerm, setSearchTerm] = useState('')

    const handleSearch = (e) => {
        const value = e.target.value
        setSearchTerm(value)
        onSearch(value)
    }

    return (
        <div className="relative">
            <Search className="absolute left-3 top-3 text-gray-400" size={20} />
            <input
                type="text"
                placeholder="Search by name, email, mobile, role, id, or salary..."
                value={searchTerm}
                onChange={handleSearch}
                className="w-full pl-10 pr-4 py-2 border border-gray-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-500 focus:border-transparent"
            />
        </div>
    )
}

export default SearchBar
