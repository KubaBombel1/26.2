package sample;

public class Kwadrat

{

    int field;


               int circuit;


           Kwadrat (int L)


    {
        this.field = L;


                   this.circuit = L;

    }

    void count_circuit()

    {


        System.out.println( "Obwód " + this.circuit * 4 );


    }

              void count_field()


    {

                    System.out.println( "Pole " + this.field * this.field );


    }

}