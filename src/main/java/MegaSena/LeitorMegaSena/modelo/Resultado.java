package MegaSena.LeitorMegaSena.modelo;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Resultado {

	private int id;
	private Long concurso;
	private Long dezena_1;
	private Long dezena_2;
	private Long dezena_3;
	private Long dezena_4;
	private Long dezena_5;
	private Long dezena_6;

	public void montaResultado(Navegador navecador) {
		for (int tr = 2; tr < 2255; tr++) {
			this.concurso = Long.parseLong(
					navecador.driver.findElementByXPath("/html/body/table/tbody/tr[" + tr + "]/td[1]").getText());
			this.dezena_1 = Long.parseLong(
					navecador.driver.findElementByXPath("/html/body/table/tbody/tr[" + tr + "]/td[3]").getText());
			this.dezena_2 = Long.parseLong(
					navecador.driver.findElementByXPath("/html/body/table/tbody/tr[" + tr + "]/td[4]").getText());
			this.dezena_3 = Long.parseLong(
					navecador.driver.findElementByXPath("/html/body/table/tbody/tr[" + tr + "]/td[5]").getText());
			this.dezena_4 = Long.parseLong(
					navecador.driver.findElementByXPath("/html/body/table/tbody/tr[" + tr + "]/td[8]").getText());
			this.dezena_5 = Long.parseLong(
					navecador.driver.findElementByXPath("/html/body/table/tbody/tr[" + tr + "]/td[7]").getText());
			this.dezena_6 = Long.parseLong(
					navecador.driver.findElementByXPath("/html/body/table/tbody/tr[" + tr + "]/td[8]").getText());

		}

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Long getConcurso() {
		return concurso;
	}

	public void setConcurso(Long concurso) {
		this.concurso = concurso;
	}

	public Long getDezena_1() {
		return dezena_1;
	}

	public void setDezena_1(Long dezena_1) {
		this.dezena_1 = dezena_1;
	}

	public Long getDezena_2() {
		return dezena_2;
	}

	public void setDezena_2(Long dezena_2) {
		this.dezena_2 = dezena_2;
	}

	public Long getDezena_3() {
		return dezena_3;
	}

	public void setDezena_3(Long dezena_3) {
		this.dezena_3 = dezena_3;
	}

	public Long getDezena_4() {
		return dezena_4;
	}

	public void setDezena_4(Long dezena_4) {
		this.dezena_4 = dezena_4;
	}

	public Long getDezena_5() {
		return dezena_5;
	}

	public void setDezena_5(Long dezena_5) {
		this.dezena_5 = dezena_5;
	}

	public Long getDezena_6() {
		return dezena_6;
	}

	public void setDezena_6(Long dezena_6) {
		this.dezena_6 = dezena_6;
	}

}
