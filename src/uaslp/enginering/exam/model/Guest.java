package uaslp.enginering.exam.model;

public class Guest{
        String Name;
        String Address;
        String Country;
        String PhoneNumber;


        public void setName(String nombre) {
                this.Name = nombre;
        }

        public String getName() {
                return Name;
        }

        public void setAddress(String adress) {
                Address = adress;
        }

        public String getAdress() {
                return Address;
        }

        public void setCountry(String country) {
                Country = country;
        }

        public String getCountry() {
                return Country;
        }

        public void setPhoneNumber(String phoneNumber) {
                PhoneNumber = phoneNumber;
        }

        public String getPhoneNumber() {
                return PhoneNumber;
        }
}
