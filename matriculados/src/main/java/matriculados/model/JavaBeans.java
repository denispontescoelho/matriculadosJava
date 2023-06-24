package matriculados.model;

public class JavaBeans {
	
	private Integer ensalamento;
	private Integer matricula;
	private String nomeAluno;
	private String nomeCurso;
	private String disciplina;
	private String nomeTurma;
	
	

	public JavaBeans(Integer ensalamento, Integer matricula, String nomeAluno, String nomeCurso, String disciplina,
			String nomeTurma) {
		super();
		this.ensalamento = ensalamento;
		this.matricula = matricula;
		this.nomeAluno = nomeAluno;
		this.nomeCurso = nomeCurso;
		this.disciplina = disciplina;
		this.nomeTurma = nomeTurma;
	}

	public Integer getEnsalamento() {
		return ensalamento;
	}

	public void setEnsalamento(Integer ensalamento) {
		this.ensalamento = ensalamento;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public String getNomeTurma() {
		return nomeTurma;
	}

	public void setNomeTurma(String nomeTurma) {
		this.nomeTurma = nomeTurma;
	}
	
	public JavaBeans() {
		super();
		
	}

}
