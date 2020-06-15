package tp6TPPrincipiosSolid;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BancoTest {

	private BancoCiudad banco;
	private Cliente braian;
	private Cliente giuliana;
	private SolicitudCreditoPersonal solicitudCreditoPersonal1;
	private SolicitudCreditoHipotecario solicitudCreditoHipotecario2;
	private PropiedadInmobiliaria torresDeGuido;
	
	
	@BeforeEach
	void setUp() throws Exception {
		banco = new BancoCiudad();
		torresDeGuido = new PropiedadInmobiliaria("torresSobreGuido", "guido1600", 800.000);
		solicitudCreditoHipotecario2 = new SolicitudCreditoHipotecario(giuliana, 150.000, 12,12.000);
		solicitudCreditoPersonal1= new SolicitudCreditoPersonal(braian, 120.000, 6,10.000);
		braian = new Cliente("braian", "rosales", "calle16", 26, 37.500,solicitudCreditoPersonal1, torresDeGuido);
		giuliana= new Cliente("giuliana", "mongues", "lissandroDeLaTorre", 24, 45.000, solicitudCreditoHipotecario2, torresDeGuido);
		
	}

	
	
	@Test
	void Test01Cliente() {
		assertEquals(braian.getSolicitudDeCredito().getMontoSolicitado(),120.000);
		assertEquals(giuliana.getSolicitudDeCredito().getMontoSolicitado(),150.000);
	}
		
	@Test
	void Test02BancoDesembolsaDineroAlClienteBraian() {
		
		banco.setCliente(braian);
		
		solicitudCreditoPersonal1.setClienteQueLaSolicita(braian);
		assertEquals(solicitudCreditoPersonal1.ingresoAnualEsMayorAQuinceMilQuinientos(),true);
		assertEquals(solicitudCreditoPersonal1. montoDeLaCuotaNoSupereAlIngresoRequeridoDeAprobacion(),true);
		
		
		assertEquals(banco.aceptaLaSolicitudDeCreditoDe(braian),true);
		
		banco.desembolsaDinero(braian);
		assertEquals(braian.getMontoObtenidoPorElBanco(),120.000);
		
	}
	
	@Test
	void test03BancoDesembolsaDineroAlClienteGiuliana() {
		banco.setCliente(giuliana);
		
		solicitudCreditoHipotecario2.setClienteQueLaSolicita(giuliana);
		assertEquals(solicitudCreditoHipotecario2.noSuperaElCincuentaPorCientoDeIngresoMensualesDelTitular(),true);
		assertEquals(solicitudCreditoHipotecario2.montoTotalSolicitadoNoEsMayorAlSetentaPorCientoDelValorFiscalComoGarantia(),true);
		
		assertEquals(banco.aceptaLaSolicitudDeCreditoDe(giuliana),true);
		
		banco.desembolsaDinero(giuliana);
		assertEquals(giuliana.getMontoObtenidoPorElBanco(),150.000);
	}
	
	@Test
	void test04CantidadClienteDelBancoEsIgualAUno() {
		
		banco.setCliente(braian);
		banco.agregarNuevoCliente();
		assertEquals(banco.cantidadDeClientes(), 1);
	}
	
	@Test
	void test05CantidadClienteDelBancoEsIgualADos() {
		banco.setCliente(braian);
		banco.agregarNuevoCliente();
		banco.setCliente(giuliana);
		banco.agregarNuevoCliente();
		assertEquals(banco.cantidadDeClientes(), 2);
	}
	
	@Test
	void Test06LaCantidadDeDineroADesembolsarDelBancoEsDoscientoSetentaMil() {
		
		banco.setCliente(braian);
		banco.agregarNuevoCliente();
		banco.desembolsaDinero(braian);
		
		banco.setCliente(giuliana);
		banco.agregarNuevoCliente();
		banco.desembolsaDinero(giuliana);
		
		assertEquals(banco.cantidadDeClientes(), 2);
		
		assertEquals(banco.montoTotalADesembolsarDelBanco(), 270.000);
	}
	
}
