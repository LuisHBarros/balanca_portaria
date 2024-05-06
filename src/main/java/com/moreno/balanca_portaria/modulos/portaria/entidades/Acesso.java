package com.moreno.balanca_portaria.modulos.portaria.entidades;

import java.util.Date;

public class Acesso {
    // FK_AGENTE_VISITA
    // FK_AGENTE_TRANSPORTE
    private Integer id_acesso;
    private String ace_notaFiscal;
    private Date ace_entrada;
    private Date ace_saida;
    private String ace_placa;
    private String ace_natureza;
    // FK_USUARIO_ENTRADA
    // FK_USUARIO_SAIDA

}
