package uvsq21807481;

public class DAOFactory {

    public static DAO<Personnel> PersonnelDAO(){
        return new PersonnelDAO();
    }
}
