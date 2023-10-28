package com.jnb;

import com.jnb.tools.IpId;
import com.jnb.tools.TotalHost;
import com.jnb.tools.SubRedes;
import javax.swing.JOptionPane;

public class IpSubmask {
    public static void main(String[] args) {
        String ip, subMask;
        int opcoes = 1;
        String[] escolha = {"Sair", "Troca IP e máscara de sub-rede", "IP ID", "Total Host"};
        ip = JOptionPane.showInputDialog(null,"Digite o endereço IP: ", 
        "IP-SUBMASK",JOptionPane.QUESTION_MESSAGE);
        subMask = JOptionPane.showInputDialog(null,"Digite a máscara de sub-rede:", 
        "IP-SUBMASK",JOptionPane.QUESTION_MESSAGE);
        while (opcoes != 0) {
            opcoes = JOptionPane.showOptionDialog(null, "O que deseja fazer com o IP "+ip+" e a máscara de sub-rede "+subMask+":", 
            "IP-SUBMASK",
            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, escolha, escolha[0]);
            switch (opcoes) {
                case 0:
                    System.out.println("Saindo");
                    break;
                case 1:
                    ip = JOptionPane.showInputDialog(null,"Digite o endereço IP: ", 
                    "IP-SUBMASK",JOptionPane.QUESTION_MESSAGE);
                    subMask = JOptionPane.showInputDialog(null,"Digite a máscara de sub-rede:", 
                    "IP-SUBMASK",JOptionPane.QUESTION_MESSAGE);
                    break;
                case 2:
                    IpId.ipidcont(ip, subMask);
                    break; 
                case 3:
                    TotalHost.host(subMask);
                    break;
                case 4:
                    SubRedes.sub();
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opção invalida",
                    "IP-SUBMASK",JOptionPane.PLAIN_MESSAGE);
                    break;
            }
        }
    }
}


         