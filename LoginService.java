public class LoginService {

  public static boolean efetuarLogin(String user, String pass){
    boolean loginEfetuado = false;
      if (user.equals("admin") && pass.equals("123")) {
        loginEfetuado = true;
      } else {
        loginEfetuado = false;
      }
      return loginEfetuado;
  }

  public static void main(String[] args) {
      String user = "";
      String pass = "";

      user = args[0];
      pass = args[1];


      if (user != "" && pass !=""){
      Boolean logado = efetuarLogin(user, pass);
      if (logado == true){
        System.out.println("Login Efetuado!");
      } else {
        System.out.println("Usuário ou senha inválido!");
      }
    } else {
      System.out.println("Erro! Digite o usuário e a senha!");
    }
    }
    
}
