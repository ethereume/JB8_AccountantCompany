public enum Workplace {

    LINEWORKERS("Line workers"),
    ACCOUTING("Accounting"),
    MANAGEMENTSTAFF("Management staff");

    private String typeOfWork;
    private Workplace(String name){
        typeOfWork = name;
    }
    public String getTypeOfWork(){
        return typeOfWork;
    }
}
