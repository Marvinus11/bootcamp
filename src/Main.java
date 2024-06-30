import br.com.bootcamp.dominio.Curso;
import br.com.bootcamp.dominio.Mentoria;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        Mentoria ment = new Mentoria();

        curso.setTitulo("Java");

        System.out.println(ment.toString());
        System.out.println(curso.toString());
    }
}