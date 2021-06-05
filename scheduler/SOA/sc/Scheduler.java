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


}
