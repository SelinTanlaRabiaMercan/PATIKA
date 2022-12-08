package Login;

public abstract class Account implements Comparable<Account> {
    Login dc = new Login();
    private AuthenticationStatus status = AuthenticationStatus.FAIL;

    @Override
    public int compareTo(Account o) {
        return 0;
    }

    enum AuthenticationStatus {
        FAIL,
        SUCCESS;
    }

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Account(User user) {
        this.user = user;
    }

    public Account() {
    }

    AccountManager accountManager = new AccountManager();

    public final void bilgileriGoster() {
        dc.duzcizgi();
        System.out.println(
                "Kullanıcı Bilgileri \n" +
                        "\nAdı    : " + user.getIsim() +
                        "\nSoyadı : " + user.getSoyisim() +
                        "\nEmail  : " + user.getEmail() +
                        "\nYaş    : " + user.getYas() +
                        "\nMeslek : " + user.getMeslek() +
                        "\nId     : " + user.getId()
        );
    }

    public void login(String email, String sifre, Account account) {
        if (account.getUser().getEmail().equals(email) && account.getUser().getSifre().equals(sifre)) {
            status = AuthenticationStatus.SUCCESS;
        }
    }
    public void adresyaz(){
        System.out.println("Adres Bilgileri\n");
        for(Adres adres: user.getAdreslist()){
            adres.showadresInfo();
        }
    }

    public void adresEkle(){
        AdresManager.adresEkle(this.user);
    }
    public void adresSil(){
        AdresManager.adresSil(this.user);
    }

    public abstract void yenipolice() ;
}
