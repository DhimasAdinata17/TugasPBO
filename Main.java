import javax.swing.*;
import java.util.Scanner;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        //Scanner untuk Pasien
        Pasien psn = new Pasien();
        Scanner Pasien = new Scanner(System.in);
        int id;
        String nama,alamat,no;



        System.out.println("===INPUT PASIEN===");
        System.out.print("Id      : ");
        id = Pasien.nextInt();
        psn.setId_pasien(id);
        System.out.print("Nama      : ");
        nama = Pasien.next();
        psn.setNama_pasien(nama);
        System.out.print("Alamat  : ");
        alamat = Pasien.next();
        psn.setAlamat(alamat);
        System.out.print("No hp   : ");
        no = Pasien.next();
        psn.setNo_hp(no);
        System.out.println("======================");

        //Pendaftaran
        Pendaftaran pdf = new Pendaftaran();
        Scanner Pendaftaran = new Scanner(System.in);
        int idpdf;
        String tgl;

        System.out.println("===PENDAFTARAN===");
        System.out.print("Id Pendaftaran                : ");
        idpdf = Pendaftaran.nextInt();
        pdf.setId_daftar(idpdf);
        System.out.println("Id pasien                     : "+psn.getId_pasien());
        System.out.print("Tangal Daftar dd/mm/yyyy      :");
        tgl = Pendaftaran.next();
        pdf.setTgl_daftar(tgl);
        System.out.println("==============");


        //Memilih Dokter
        Dokter dt1 = new Dokter();
        dt1.id_dokter = (1);
        dt1.nama_dokter = ("Dr.Budi");
        dt1.spesialis = ("Spesialis Anak");

        Dokter dt2 = new Dokter();
        dt2.id_dokter = 2;
        dt2.nama_dokter = "Dr.Iwan";
        dt2.spesialis = "Spesialis Penyakit Dalam";

        Dokter dt3 = new Dokter();
        dt3.id_dokter = 3;
        dt3.nama_dokter = "Dr.Setiawan";
        dt3.spesialis = "Spesialis Jantung";

        System.out.println("===PILIHAN DOKTER===");
        System.out.print("1.)"+dt1.nama_dokter);
        System.out.println(" Spesialis"+dt1.spesialis);
        System.out.print("2.)"+dt2.nama_dokter);
        System.out.println(" Spesialis"+dt2.spesialis);
        System.out.print("3.)"+dt2.nama_dokter);
        System.out.println(" Spesialis"+dt3.spesialis);
        System.out.println("=====================");
        System.out.print("Masukkan Pilihan dokter  : ");

//        Scanner Pilihan = new Scanner(System.in);
//        int plh = Pilihan.nextInt();
//
//        if (plh == 1){
//        }

        //Pemeriksaan
        Pemeriksaan pmk = new Pemeriksaan();
        Scanner Pemeriksaan = new Scanner(System.in);

        int idpmk;
        String rsp,ketp;

        System.out.println("===Pemeriksaan===");
        System.out.print("id Pemeriksaan      : ");
        idpmk = Pemeriksaan.nextInt();
        pmk.setId_periksa(idpmk);
        System.out.print("Resep               : ");
        rsp = Pemeriksaan.next();
        pmk.setResep(rsp);
        System.out.print("Keterangan          : ");
        ketp = Pemeriksaan.next();
        pmk.setKeterangan(ketp);


        //Rawat
        Rawat rwt = new Rinap();
        Scanner input = new Scanner(System.in);
        int idrinp = 0;
        String ketrinp;

        System.out.println("===Pilihan Rawat===");
        System.out.println("1.) Rawat Inap");
        System.out.println("2.) Rawat Jalan");
        System.out.println("=======================");
        System.out.print("Masukkan Pilihan    : ");
        int pil_rwt = input.nextInt();

        if (pil_rwt == 1){
            Rawat.idruang();
            idrinp = input.nextInt();
            ((Rinap) rwt).setR_inap(idrinp);
            Rawat.ketruang();
            ketrinp = input.next();
            ((Rinap) rwt).setKeterangan_r(ketrinp);
        }
        else if (pil_rwt == 2){
            System.out.print("id Ruang Inap   : ");
            idrinp = input.nextInt();
            ((Rinap) rwt).setR_inap(idrinp);
            System.out.print("Keterangan      : " );
            ketrinp = input.next();
            ((Rinap) rwt).setKeterangan_r(ketrinp);
        }

        //Output
        java.io.File file= new java.io.File("output.txt");
        try {
            java.io.PrintWriter output = new java.io.PrintWriter(file);
            output.println("========PENDAFTARAN=======");
            output.println("id pendaftaran \t= "+idpdf);
            output.println("Tanggal \t="+tgl);
            output.println("_________________________");
            output.println("id pasien\t = "+id);
            output.println("Nama Pasien\t= "+nama);
            output.println("Alamat\t = "+alamat);
            output.println("No HP\t = "+no);
            output.println("_________________________");
            output.println("Resep obat \t = "+rsp);
            output.print(" "+ketp);
            output.println("id periksa \t = "+idpmk);
            output.println("id Ruangan \t = "+idrinp);
            output.close();
            }catch (FileNotFoundException e){
                System.out.println("tidak ada file");

        }
    }
}