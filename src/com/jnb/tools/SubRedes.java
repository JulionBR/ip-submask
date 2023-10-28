package com.jnb.tools;

import javax.swing.JOptionPane;

public class SubRedes {
    public static void sub(String subMask) {
        String[] subMaskSlipt, subMaskBinarioSplipt;
        int[] subMaskInteiro = new int[4]; 
        double hostTotal, expoente = 0;
        String subMaskBinario;
        subMaskSlipt = subMask.split("\\.");
        for(int i = 0; i<=3; i++){
            subMaskInteiro[i] = Integer.parseInt(subMaskSlipt[i]);
            subMaskBinario = Integer.toBinaryString(subMaskInteiro[i]);
            if (subMaskInteiro[i] != 255) {
                while (subMaskBinario.length() < 8) {
                    subMaskBinario = "0" + subMaskBinario;
                }
                subMaskBinarioSplipt = subMaskBinario.split("");
                for(int c = 0; c<=7; c++){
                    if (subMaskBinarioSplipt[c].equals("1")) {
                        expoente ++;
                    }
                }
            }
        }
        hostTotal = Math.pow(2, expoente);
        JOptionPane.showMessageDialog(null,"O total de Sub-rede é: "+ hostTotal, 
        "IP-SUBMASK",JOptionPane.PLAIN_MESSAGE);
    }
}
