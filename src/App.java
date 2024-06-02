import java.lang.reflect.Field;

public class App {
	public static void main(String args[]) {
		ClasseComAnotacao classe = new ClasseComAnotacao();
		Field[] fields = classe.getClass().getDeclaredFields();
		
		for (Field field : fields) {
			if (field.isAnnotationPresent(Tabela.class)) {
				Tabela tabela = field.getAnnotation(Tabela.class);
				String nomeTabela = tabela.value();
				System.out.println(nomeTabela);
			}
		}
	}
}
