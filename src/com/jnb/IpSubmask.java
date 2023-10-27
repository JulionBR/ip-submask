package com.jnb;

import java.util.Scanner;
import com.jnb.tools.IpId;

public class IpSubmask {
    public static void main(String[] args) {
        String ip, subMask;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o endereço IP: ");
        ip = scanner.nextLine();
        System.out.print("Digite a máscara de sub-rede: ");
        subMask = scanner.nextLine();

        scanner.close();
        IpId.ipidcont(ip, subMask);
    }
}
