import java.util.*;
public class EmailApp{
    private String emri;
    private String mbiemri;
    private String password;
    private String fakulteti;
    private String prapashtesa = "upt.al";
    private String emaili;
    private int kapaciteti = 1000; //mailbox capacity
    private String altEmail;

    //Konstruktori qe merr argument emrin dhe mbiemrin
    public EmailApp(String emri, String mbiemri){
        this.emri = emri;
        this.mbiemri = mbiemri;
        this.fakulteti = setFakulteti();
        System.out.println("Fakulteti: "+this.fakulteti);
        // thirrja e metodes qe gjeneron nje password te rastesishem
        this.password = randomPassword(10);
        //kombinimi i elementeve per te gjeneruar e-mailin
        emaili = emri.toLowerCase()+"."+mbiemri.toLowerCase()+"@"+this.fakulteti+"."+prapashtesa;
    }
    //Fakulteti
    public String setFakulteti(){
        Scanner input = new Scanner(System.in);
        System.out.println("1. Fakulteti i Teknologjise se Informacionit");
        System.out.println("2. Fakulteti i Inxhinierise Elektrike");
        System.out.println("3. Fakulteti i Inxhinierise Mekanike");
        System.out.println("Jepni numrin e fakultetit perkates:");
        int fakulteti = input.nextInt();
        if(fakulteti == 1){
            return "fti";
        }else if(fakulteti == 2){
            return "fie";
        }else if(fakulteti == 3){
            return "fim";
        }else{
            return "Verejtje! Ju nuk keni dhene nje numer qe perkon me ndonje nga fakultetet.";
        }
    }
    //Gjenerimi i nje passwordi te rastesishem
private String randomPassword(int length){
        String shifrat = "QWERTYUIOPASDFGHJKLZXCVBNM0123456789!#$%&*";
        char [] password = new char[length];
        for(int i=0; i<length; i++){
            int random = (int)(Math.random() * shifrat.length());
            password[i] = shifrat.charAt(random);
        }
        return new String(password);
}
    //vendosja e kapacitetit te mesazheve
    public void setKapaciteti(int kapaciteti){
        this.kapaciteti = kapaciteti;
    }

    //e-maili alternativ
    public void setEmailAlternativ(String altEmail){
        this.altEmail = altEmail;
    }
    //ndryshimi i passwordit
    public void ndryshoPassword(String password){
        this.password = password;
    }
    public int getKapaciteti(){
        return kapaciteti;
    }
    public String getEmailAlternativ(){
        return altEmail;
    }
    public String getPassword(){
        return password;
    }

    public String afishoTeDhena(){
        return "Perdoruesi: "+emri+" "+mbiemri+
                "\n E-maili i gjeneruar: "+emaili+
                "\n Kapaciteti i memorjes se e-mailit: "+kapaciteti+
                "\n Fjalekalimi i gjeneruar eshte: "+password+
                ". Ju lutem per arsye sigurie,\n ndryshoni fjalekalimin ne momentin qe logoheni ne e-mail";
    }
}