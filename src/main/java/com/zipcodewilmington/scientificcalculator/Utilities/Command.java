package com.zipcodewilmington.scientificcalculator.Utilities;

import com.zipcodewilmington.scientificcalculator.Application.Console;

import java.util.ArrayList;

public class Command {
    public String printCommands () {
        ArrayList<String> commands = new ArrayList<>();
        commands.add("Add");
        commands.add(" Subtract");
        commands.add(" Pow");
        commands.add( "Multiply ");
        commands.add( " Exponentiation");
        commands.add(" Divide" );
        commands.add( "Inverse");
        commands.add( " Invert sign");
        commands.add("Err" );
        commands.add ( "Clear errors ");
        commands.add(" Switch mode");
        commands.add(" Switch Binary " );
        commands.add( " Switch Octal");
        commands.add( "Switch Decimal" );
        commands.add("Switch Hexadecimal ");
        commands.add ( "M+ key ");
        commands.add(" MC key" ) ;
        commands.add ( "MRC key" );
        commands.add ( " Trig ");
        commands.add ( " Sine");
        commands.add ( "Cosine");
        commands.add ( "Tangent");
        commands.add( "Inverse Sine ");
        commands.add( " Inverse Cosine");
        commands.add( "Inverse Tangent");
        commands.add ( "Switch trig mode" );
        commands.add( "Log");
        commands.add("Inverse logarithm " );
        commands.add( "Natural Logarithm");
        commands.add( " Inverse natural logarithm");
        commands.add( " Factorila function");








        String toRet = "";
        for (String s : commands) {
            toRet += s + "\n";
        }
        return toRet;



    }
    public static void runCommand(String command){
        Console.println( " Running command" + command);

    }
}
