package MegaSena.LeitorMegaSena;

import java.sql.SQLException;

import org.openqa.selenium.By;

import MegaSena.LeitorMegaSena.Dao.ResultadoDao;
import MegaSena.LeitorMegaSena.modelo.Navegador;
import MegaSena.LeitorMegaSena.modelo.Resultado;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws SQLException {

		Navegador navegadorIE = new Navegador("C:\\Users\\José Carlos\\Documents\\" + "IEDriverServer.exe",
				"C:\\Users\\José Carlos\\Downloads\\D_MEGA.HTM");
		Resultado resultado = new Resultado();
		ResultadoDao dao = new ResultadoDao();
				
		navegadorIE.abreIE();
		
		int n = 0;
		for (int tr = 2 ; tr <= 2255 ; tr++) {
					
			try {
				n++;
				resultado.setConcurso(Long.parseLong(navegadorIE.driver.findElement(By.xpath("/html/body/table/tbody/tr["+tr+"]/td[1]")).getText()));
				resultado.setDezena_1(Long.parseLong(navegadorIE.driver.findElement(By.xpath("/html/body/table/tbody/tr["+tr+"]/td[3]")).getText()));
				resultado.setDezena_2(Long.parseLong(navegadorIE.driver.findElement(By.xpath("/html/body/table/tbody/tr["+tr+"]/td[4]")).getText()));
				resultado.setDezena_3(Long.parseLong(navegadorIE.driver.findElement(By.xpath("/html/body/table/tbody/tr["+tr+"]/td[5]")).getText()));
				resultado.setDezena_4(Long.parseLong(navegadorIE.driver.findElement(By.xpath("/html/body/table/tbody/tr["+tr+"]/td[6]")).getText()));
				resultado.setDezena_5(Long.parseLong(navegadorIE.driver.findElement(By.xpath("/html/body/table/tbody/tr["+tr+"]/td[7]")).getText()));
				resultado.setDezena_6(Long.parseLong(navegadorIE.driver.findElement(By.xpath("/html/body/table/tbody/tr["+tr+"]/td[8]")).getText()));
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				System.out.println("Caiu no catch  " + n );
							
			}
		
			dao.adicionaResultado(resultado);
			
		}
		navegadorIE.driver.close();
	}
}
