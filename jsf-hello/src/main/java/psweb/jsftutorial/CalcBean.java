package psweb.jsftutorial;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope("session")
public class CalcBean 
{   
	
	//
	//Atributos
	//
	Double op1;
	Double op2;
	String operador;
	Double  resultado;
		

	//
	// Operações
	//	
	public void calc() {
		
		
		if(operador.equals("sum")) 
		{
			resultado = op1+op2;
		}else if(operador.equals("sub")) 
		{
			resultado = op1-op2;
		}else if(operador.equals("mult")) 
		{
			resultado =  op1*op2;
		}
		else{
			if(op2==0) {
				String msg="Não é possivel realizar divisão por zero";
				FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_WARN,msg,"");
				FacesContext.getCurrentInstance().addMessage(null, fm);
				resultado = Double.NaN;
			}else{
			
				resultado =  op1/op2;
			}	
		}
		System.out.println("O resultado: "+resultado);
	}

		
	//
	//Metodos de acesso
	//
	
	public String getOperador() {
		return operador;
	}
	public void setOperador(String operador) {
		this.operador = operador;
	}
	public Double getOp1() {
		return op1;
	}
	public void setOp1(Double op1) {
		this.op1 = op1;
	}
	public Double getOp2() {
		return op2;
	}
	public void setOp2(Double op2) {
		this.op2 = op2;
	}


	public Double getResultado() {
		return resultado;
	}


	public void setResultado(Double resultado) {
		this.resultado = resultado;
	}
	
}
	