package MegaSena.LeitorMegaSena.modelo;

import java.io.File;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;

public class Navegador {
	
	public String caminhoDrive;
	public String url;
	public InternetExplorerDriver driver;
	//driver.get("C:\\Users\\José Carlos\\Downloads\\D_MEGA.HTM");
	
	public Navegador(String caminhoDrive, String url) {
		this.caminhoDrive = caminhoDrive;
		this.url = url;
		InternetExplorerDriverService.Builder serviceBuilder = new InternetExplorerDriverService.Builder();
		serviceBuilder.usingAnyFreePort(); // This specifies that sever can pick any available free port to start
		serviceBuilder.usingDriverExecutable(new File(caminhoDrive)); //Tell it where you server exe is
		InternetExplorerDriverService service = serviceBuilder.build(); //Create a driver service and pass it to Internet explorer driver instance
		driver = new InternetExplorerDriver(service);
		
	}
			
	public void abreIE() {
		driver.get(url);		
	
	}

}
