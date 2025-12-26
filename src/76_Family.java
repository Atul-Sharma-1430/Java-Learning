class Family {
    private final String fatherName;
    private final String motherName;
    private final String myName;
    private final String brotherName;

    public Family(String fatherName, String motherName, String myName, String brotherName) {
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.myName = myName;
        this.brotherName = brotherName;
    }

    @Override
    public String toString() {
        return "Family{fatherName='" + fatherName + "', motherName='" + motherName
                + "', myName='" + myName + "', brotherName='" + brotherName + "'}";
    }

    public static void main(String[] args) {
        Family family = new Family("Rajesh", "Sunita", "Atul", "Aditya");
        System.out.println(family);
    }
}
