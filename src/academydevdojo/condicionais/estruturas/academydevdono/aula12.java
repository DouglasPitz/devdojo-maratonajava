package academydevdojo.condicionais.estruturas.academydevdono;

public class aula12 {
    public static void main(String[] args) {
        int [][] arraymulti1 = new int[3][3];
        arraymulti1 [0][0] = 22;
        arraymulti1 [0][1] = 11;
        arraymulti1 [0][2] = 4;
        arraymulti1 [1][0] = 44;
        arraymulti1 [1][1] = 55;
        arraymulti1 [1][2] = 9;
        arraymulti1 [2][0] = 2;
        arraymulti1 [2][1] = 5;
        arraymulti1 [2][2] = 21;
        int resultadoMultipliPrincipal = 1;
        for (int i = 0; i < arraymulti1.length; i++) {
            for (int j = 0; j < arraymulti1.length; j++) {
                if(i==j){
                    resultadoMultipliPrincipal = resultadoMultipliPrincipal * arraymulti1[i][j];

                }
                
            }
            
        }
        System.out.println(resultadoMultipliPrincipal);
    }
}
