package psweb.jsftutorial;

import org.primefaces.component.inputtext.InputText;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope("session")
public class HelloBean 
{   
	
	//
	//Atributos
	//
	String nome;
	InputText nomeWidget;
	

	//
	// Operações
	//	
	public void print() {
		System.out.println("Value bindings, " + nome +"!");
		System.out.println("Widget bindings, " + nomeWidget.getValue() +"!");
	}
		
	//
	//Metodos de acesso
	//
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public InputText getNomeWidget() {
		return nomeWidget;
	}

	public void setNomeWidget(InputText nomeWidget) {
		this.nomeWidget = nomeWidget;
	}
}  