package test1;

public class Help {

}
class DefaultSolution1 {

    public static void main(String[] args) {
        // Platform entry point – no execution required
    }

    interface Resource {
        int getUsage();
        void checkHealth() throws ResourceOverloadException;
    }

    static abstract class AbstractResource implements Resource {
        private int usage;

        protected void setUsage(int usage) {
            if (usage < 0 || usage > 100) {
                throw new CriticalFailureException("Invalid resource usage");
            }
            this.usage = usage;
        }

        public int getUsage() {
            return usage;
        }
    }

    static class CPUResource extends AbstractResource {
        CPUResource(int usage) {
            setUsage(usage);
        }

        public void checkHealth() throws ResourceOverloadException {
            if (getUsage() > 80) {
                throw new ResourceOverloadException("CPU overloaded");
            }
        }
    }

    static class MemoryResource extends AbstractResource {
        MemoryResource(int usage) {
            setUsage(usage);
        }

        public void checkHealth() throws ResourceOverloadException {
            if (getUsage() > 75) {
                throw new ResourceOverloadException("Memory overloaded");
            }
        }
    }

    static class DiskResource extends AbstractResource {
        DiskResource(int usage) {
            setUsage(usage);
        }

        public void checkHealth() throws ResourceOverloadException {
            if (getUsage() > 90) {
                throw new ResourceOverloadException("Disk overloaded");
            }
        }
    }

    static class ResourceOverloadException extends Exception {
        ResourceOverloadException(String msg) { super(msg); }
    }

    static class CriticalFailureException extends RuntimeException {
        CriticalFailureException(String msg) { super(msg); }
    }
}

class DefaultSolution2 {

    public static void main(String[] args) {
        // Platform entry point – no execution required
    }

    interface OrderAction {
        boolean canCancel();
        boolean canRefund();
    }

    enum OrderStatus implements OrderAction {
        CREATED {
            public boolean canCancel() { return true; }
            public boolean canRefund() { return false; }
        },
        CONFIRMED {
            public boolean canCancel() { return true; }
            public boolean canRefund() { return false; }
        },
        SHIPPED {
            public boolean canCancel() { return false; }
            public boolean canRefund() { return false; }
        },
        DELIVERED {
            public boolean canCancel() { return false; }
            public boolean canRefund() { return true; }
        },
        CANCELLED {
            public boolean canCancel() { return false; }
            public boolean canRefund() { return false; }
        }
    }

    static class Order {
        private int id;
        private String customer;
        private OrderStatus status;

        Order(int id, String customer) {
            this.id = id;
            this.customer = customer;
            this.status = OrderStatus.CREATED;
        }

        public void cancel() {
            if (!status.canCancel()) {
                throw new IllegalStateException("Cannot cancel order");
            }
            status = OrderStatus.CANCELLED;
        }

        public void refund() {
            if (!status.canRefund()) {
                throw new IllegalStateException("Refund not allowed");
            }
        }
    }
}

class DefaultSolution3 {

    public static void main(String[] args) {
        // Platform entry point – no execution required
    }

    interface Payroll {
        double calculateSalary();
    }

    static abstract class Employee implements Payroll {
        private int id;
        private String name;
        private String role;
        private double salary;

        protected Employee(int id, String name, String role, double salary) throws InvalidSalaryException {
            this.id = id;
            this.name = name;
            this.role = role;
            setSalary(salary, role);
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary, String role) throws InvalidSalaryException {
            if (!"HR".equals(role)) {
                throw new UnauthorizedAccessException("Only HR can modify salary");
            }
            if (salary <= 0) {
                throw new InvalidSalaryException("Invalid salary");
            }
            this.salary = salary;
        }
    }

    static class FullTimeEmployee extends Employee {
        FullTimeEmployee(int id, String name, String role, double salary) throws InvalidSalaryException {
            super(id, name, role, salary);
        }

        @Override
        public double calculateSalary() {
            return getSalary() + 5000;
        }
    }

    static class ContractEmployee extends Employee {
        ContractEmployee(int id, String name, String role, double salary) throws InvalidSalaryException {
            super(id, name, role, salary);
        }

        @Override
        public double calculateSalary() {
            return getSalary();
        }
    }

    static class UnauthorizedAccessException extends RuntimeException {
        UnauthorizedAccessException(String msg) { super(msg); }
    }

    static class InvalidSalaryException extends Exception {
        InvalidSalaryException(String msg) { super(msg); }
    }
}

class DefaultSolution4 {

    public static void main(String[] args) {
        // Platform entry point – no execution required
    }

    interface Transaction {
        void deposit(double amount);
        void withdraw(double amount);
    }

    static abstract class BankAccount implements Transaction {
        private String accountNo;
        private String holder;
        private double balance;

        protected BankAccount(String accountNo, String holder, double balance) {
            this.accountNo = accountNo;
            this.holder = holder;
            setBalance(balance);
        }

        public double getBalance() {
            return balance;
        }

        protected void setBalance(double balance) {
            if (balance < 0) {
                throw new InvalidAmountException("Negative balance not allowed");
            }
            this.balance = balance;
        }

        @Override
        public void deposit(double amount) {
            if (amount <= 0) {
                throw new InvalidAmountException("Invalid deposit amount");
            }
            setBalance(balance + amount);
        }

        public void deposit(double amount, String mode) {
            deposit(amount);
        }

        @Override
        public abstract void withdraw(double amount);
    }

    static class SavingsAccount extends BankAccount {
        SavingsAccount(String acc, String holder, double bal) {
            super(acc, holder, bal);
        }

        @Override
        public void withdraw(double amount) {
            if (amount > getBalance()) {
                throw new InsufficientBalanceException("Insufficient balance");
            }
            setBalance(getBalance() - amount);
        }
    }

    static class CurrentAccount extends BankAccount {
        CurrentAccount(String acc, String holder, double bal) {
            super(acc, holder, bal);
        }

        @Override
        public void withdraw(double amount) {
            if (amount <= 0) {
                throw new InvalidAmountException("Invalid withdrawal");
            }
            setBalance(getBalance() - amount);
        }
    }

    static class InvalidAmountException extends RuntimeException {
        InvalidAmountException(String msg) { super(msg); }
    }

    static class InsufficientBalanceException extends RuntimeException {
        InsufficientBalanceException(String msg) { super(msg); }
    }
}