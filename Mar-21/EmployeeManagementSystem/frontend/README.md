# Frontend Setup

This is a modern React frontend for the Employee Management System.

## Getting Started

### Prerequisites
- Node.js 16+ installed
- Backend server running on `http://localhost:8090`

### Installation

```bash
# Install dependencies
npm install
```

### Development

```bash
# Start development server (runs on http://localhost:5173)
npm run dev
```

### Build

```bash
# Build for production
npm build
```

```bash
# Preview production build
npm run preview
```

## Features

- 📋 View all employees with detailed information
- ➕ Add new employees with validation
- ✏️ Edit existing employee details
- 🗑️ Delete employees
- 🔍 Search employees by name or email
- 🎨 Modern, responsive UI with Tailwind CSS
- 💾 Real-time API integration

## Frontend Stack

- **React 18** - UI library
- **Vite** - Build tool
- **Tailwind CSS** - Styling
- **Axios** - API client
- **Lucide React** - Icons

## API Endpoints Used

- `GET /employees` - Get all employees
- `GET /employees/{id}` - Get employee by ID
- `POST /employees` - Create new employee
- `PATCH /employees/{id}` - Update employee
- `DELETE /employees/{id}` - Delete employee

## Backend Configuration

The frontend is configured to connect to the backend at `http://localhost:8090`. Make sure your backend is running before starting the frontend development server.
