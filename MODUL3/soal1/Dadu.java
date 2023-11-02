package MODUL3.soal1;
import java.util.Random;

public class Dadu {
        private int nilai;
        public Dadu() {
            acakNilai();
        }

        public void acakNilai() {
            Random random = new Random();
            nilai = random.nextInt(6) + 1;
        }
        public String toString() {
            return " bernilai " + nilai;
        }
        public int getNilai() {
            return nilai;
        }
    }



