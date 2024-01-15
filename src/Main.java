import Models.Hospital;
public class Main {
    public static void main(String[] args) {

        Hospital h = new Hospital("Sadar Hospital Purnia " , "Line Bazar Purnia " , "purnia@gmail.com" , 2436464);
        System.out.println();

        h.appoinmentDoctor("MBBS" , "Pintush" , 123455 , "Heart Sarjan" , 176374, "10:30 t0 3:30" );
        h.createRoom();
        System.out.println();
        h.admitPatient("Pintush" , 22 , 84849 , "pintushmitcse@gmail.com" , "Male" , "Kuchh NHi");
    }
}