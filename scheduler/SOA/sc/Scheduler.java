package sc;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class Scheduler extends Comunicator {

/** 
 *  Sessão: Portal de agendamentos
 * 
 * **/

    /** Envio de relatório as 9:05 **/
    @Scheduled(cron = "0 5 9 ? * *")
    public void reportPortalAgendamentosPeriod1() {doTask("PortalReport","period1");}
    
    /** Envio de relatório as 12:05 **/
    @Scheduled(cron = "0 5 12 ? * *")
    public void reportPortalAgendamentosPeriod2() {doTask("PortalReport","period2");}
    
    /** Envio de relatório as 15:05 **/
    @Scheduled(cron = "0 5 15 ? * *")
    public void reportPortalAgendamentosPeriod3() {doTask("PortalReport","period3");}
    
    /** Envio de relatório as 18:05 **/
    @Scheduled(cron = "0 5 18 ? * *")
    public void reportPortalAgendamentosPeriod4() {doTask("PortalReport","period4");}

    /** Envio de relatório de teste **/
    //@Scheduled(cron = "0 * * * * *")
    //public void reportPortalAgendamentosTeste() {doTask("PortalReport","period1");}
/** 
 * 
 * Sessão: Portal de agendamentos
 * 
 * **/
    
/** 
 * 
 * Sessão: Carteira Online
 * 
 * **/
    /** Envio de relatório as 6:30 **/
    //@Scheduled(cron = "0 30 9 ? * *")
    //public void reportCarteiraPeriod1() {doTask("CarteiraReport","period1");}
    @Scheduled(cron = "0 * * * * *")
    public void reportCarteiraPeriod1() {doTask("CarteiraReport","period1");}
    
    /** Envio de relatório as 8:30 **/
    @Scheduled(cron = "0 30 8 ? * *")
    public void reportCarteiraPeriod2() {doTask("CarteiraReport","period2");}
    
    /** Envio de relatório as 10:30 **/
    @Scheduled(cron = "0 30 10 ? * *")
    public void reportCarteiraPeriod3() {doTask("CarteiraReport","period3");}
    
    /** Envio de relatório as 12:30 **/
    @Scheduled(cron = "0 30 12 ? * *")
    public void reportCarteiraPeriod4() {doTask("CarteiraReport","period4");}
    
    /** Envio de relatório as 14:30 **/
    @Scheduled(cron = "0 30 14 ? * *")
    public void reportCarteiraPeriod5() {doTask("CarteiraReport","period5");}

    /** Envio de relatório as 16:30 **/
    @Scheduled(cron = "0 30 16 ? * *")
    public void reportCarteiraPeriod6() {doTask("CarteiraReport","period6");}

    /** Envio de relatório as 18:30 **/
    @Scheduled(cron = "0 30 18 ? * *")
    public void reportCarteiraPeriod7() {doTask("CarteiraReport","period7");}

    /** Envio de relatório as 20:30 **/
    @Scheduled(cron = "0 30 20 ? * *")
    public void reportCarteiraPeriod8() {doTask("CarteiraReport","period8");}


/** 
 * 
 * Sessão: Carteira Online
 * 
 * **/


}
