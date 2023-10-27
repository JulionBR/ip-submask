package com.jnb.tools;

public class IpId {
    public static void ipidcont(String ip, String subMask) {
        String ipId, superBinario;
        String[] ipSplit, subMaskSlipt, ipBinario = new String[4], subMaskBinario = new String[4], ipBinarioSplit, subMaskBinarioSplit;
        int[] ipInteiro = new int[4], subMaskInteiro = new int[4];
        int ipDecimal;
        StringBuilder ipStringBuilder = new StringBuilder(), superBinarioBuilder = new StringBuilder();
        
        ipSplit = ip.split("\\.");
        subMaskSlipt = subMask.split("\\.");
        for(int i = 0; i<=3; i++){
            ipInteiro[i] = Integer.parseInt(ipSplit[i]);
            subMaskInteiro[i] = Integer.parseInt(subMaskSlipt[i]);
            ipBinario[i] = Integer.toBinaryString(ipInteiro[i]);
            while (ipBinario[i].length() < 8) {
                ipBinario[i] = "0" + ipBinario[i];
            }
            subMaskBinario[i] = Integer.toBinaryString(subMaskInteiro[i]);
            while (subMaskBinario[i].length() < 8) {
                subMaskBinario[i] = "0" + subMaskBinario[i];
            }
        }
        for(int i = 0; i<=3; i++){
            if (subMaskInteiro[i] != 255) {
                superBinarioBuilder.delete(0, superBinarioBuilder.length());
                ipBinarioSplit = ipBinario[i].split("");
                subMaskBinarioSplit = subMaskBinario[i].split("");
                for(int c = 0; c<=7; c++){
                    if ((subMaskBinarioSplit[c].equals("1"))&&(ipBinarioSplit[c].equals("1"))) {
                        superBinarioBuilder.append(1);
                    } else {
                        superBinarioBuilder.append(0);
                    }
                } 
                superBinario = superBinarioBuilder.toString();
                ipDecimal = Integer.parseInt(superBinario, 2);
                ipStringBuilder.append(ipDecimal+".");
                
            } else {
                ipStringBuilder.append(ipInteiro[i]+".");
            }
        }
        ipId = ipStringBuilder.toString();
        System.out.println(ipId);

    }
}