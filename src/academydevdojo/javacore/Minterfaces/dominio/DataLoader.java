package academydevdojo.javacore.Minterfaces.dominio;

public interface DataLoader {
    static final int Max_DATA_SIZE = 10;
    void load();
    default void checkPermission(){
        System.out.println("Fazendo checage de permissões");
    }
   static void retrieveMaxDataSize(){
        System.out.println("Dentro do retriveMaxDataSize na interface");
    }
}
