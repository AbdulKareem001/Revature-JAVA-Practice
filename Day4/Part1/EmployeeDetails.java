class EmployeeDetails {
    String name;
    int yearOfJoining;
    String address;

    public EmployeeDetails(String n, int year, String addr){
        name = n;
        yearOfJoining = year;
        address = addr;
    }

    public static void main(String[] args){
        EmployeeDetails employee1 = new EmployeeDetails("Robert", 1994, "64C- WallsStreet");
        EmployeeDetails employee2 = new EmployeeDetails("Sam", 2000, "68D- WallsStreet");
        EmployeeDetails employee3 = new EmployeeDetails("John", 1999, "26B- WallsStreet");

        System.out.println("Name \t Year of joining \t Address");
        System.out.println(employee1.name + "\t" + employee1.yearOfJoining + "\t" + employee1.address);
        System.out.println(employee2.name + "\t" + employee2.yearOfJoining + "\t" + employee2.address);
        System.out.println(employee3.name + "\t" + employee3.yearOfJoining + "\t" + employee3.address);
    }
}
