package associaçãoExcTeste;
import dominioAssociaçãoExc.Aluno;
import dominioAssociaçãoExc.Local;
import dominioAssociaçãoExc.Professor;
import dominioAssociaçãoExc.Seminario;

public class AssociacaoTeste01 {
	public static void main(String[] args) {
		Local local = new Local("Rua das laranjeiras");
		Aluno aluno = new Aluno("Luffy", 17);
		Professor professor = new Professor("Barba Branca", "Pirata");
		Aluno[] alunosParaSeminario = {aluno};
		Seminario seminario = new Seminario("Onde achar one piece",alunosParaSeminario, local);
		
		Seminario[] seminariosDisponiveis = {seminario};
		
		professor.setSeminarios(seminariosDisponiveis);
		
		professor.imprime();
	
	
	
	
	
	}
}
