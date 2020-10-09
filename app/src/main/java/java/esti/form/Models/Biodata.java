package java.esti.form.Models;

import android.os.Parcel;
import android.os.Parcelable;

public class Biodata implements Parcelable {
    private String nama;
    private String fakultas;
    private String jurusan;
    private String status;
    private String password;
    private String reason;
    private String nik;
    private String achievment;
    private String dateBirth;
    private String gender;
    private String citizen;
    private String agama;
    private String alamat;
    private String rt;
    private String rw;
    private String kodePos;
    private String provinsi;
    private String kota;
    private String telp;
    private String handphone;
    private String email;

    public Biodata(){

    }

    public Biodata(String nama, String fakultas, String jurusan, String status, String password, String reason, String nik, String achievment, String dateBirth, String gender, String citizen, String agama, String alamat, String rt, String rw, String kodePos, String provinsi, String kota, String telp, String handphone, String email) {
        this.nama = nama;
        this.fakultas = fakultas;
        this.jurusan = jurusan;
        this.status = status;
        this.password = password;
        this.reason = reason;
        this.nik = nik;
        this.achievment = achievment;
        this.dateBirth = dateBirth;
        this.gender = gender;
        this.citizen = citizen;
        this.agama = agama;
        this.alamat = alamat;
        this.rt = rt;
        this.rw = rw;
        this.kodePos = kodePos;
        this.provinsi = provinsi;
        this.kota = kota;
        this.telp = telp;
        this.handphone = handphone;
        this.email = email;
    }



    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getAchievment() {
        return achievment;
    }

    public void setAchievment(String achievment) {
        this.achievment = achievment;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCitizen() {
        return citizen;
    }

    public void setCitizen(String citizen) {
        this.citizen = citizen;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getRt() {
        return rt;
    }

    public void setRt(String rt) {
        this.rt = rt;
    }

    public String getRw() {
        return rw;
    }

    public void setRw(String rw) {
        this.rw = rw;
    }

    public String getKodePos() {
        return kodePos;
    }

    public void setKodePos(String kodePos) {
        this.kodePos = kodePos;
    }

    public String getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    public String getHandphone() {
        return handphone;
    }

    public void setHandphone(String handphone) {
        this.handphone = handphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }






    protected Biodata(Parcel in) {
        this.nama = in.readString();
        this.fakultas = in.readString();
        this.jurusan = in.readString();
        this.status = in.readString();
        this.password = in.readString();
        this.reason = in.readString();
        this.nik = in.readString();
        this.achievment = in.readString();
        this.dateBirth = in.readString();
        this.gender = in.readString();
        this.citizen = in.readString();
        this.agama = in.readString();
        this.alamat = in.readString();
        this.rt = in.readString();
        this.rw = in.readString();
        this.kodePos = in.readString();
        this.provinsi = in.readString();
        this.kota = in.readString();
        this.telp = in.readString();
        this.handphone = in.readString();
        this.email = in.readString();
    }

    public static final Creator<Biodata> CREATOR = new Creator<Biodata>() {
        @Override
        public Biodata createFromParcel(Parcel in) {
            return new Biodata(in);
        }

        @Override
        public Biodata[] newArray(int size) {
            return new Biodata[size];
        }
    };

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.nama);
            parcel.writeString(this.fakultas);
            parcel.writeString(this.jurusan);
            parcel.writeString(this.status);
            parcel.writeString(this.password);
            parcel.writeString(this.reason);
            parcel.writeString(this.nik);
            parcel.writeString(this.achievment);
            parcel.writeString(this.dateBirth);
            parcel.writeString(this.gender);
            parcel.writeString(this.citizen);
            parcel.writeString(this.agama);
            parcel.writeString(this.alamat);
            parcel.writeString(this.rt);
            parcel.writeString(this.rw);
            parcel.writeString(this.kodePos);
            parcel.writeString(this.provinsi);
            parcel.writeString(this.kota);
            parcel.writeString(this.telp);
            parcel.writeString(this.handphone);
            parcel.writeString(this.email);
        }

    }
