

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class InstantTeste {
    public static void main(String[] args) {
        //armazena data e hora + UTC/GMT        
        Instant ins = Instant.now();
        System.out.println(ins);
        System.out.println(ins.plus(1, ChronoUnit.WEEKS));
        
    }
}
