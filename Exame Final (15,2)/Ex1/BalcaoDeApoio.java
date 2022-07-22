public class BalcaoDeApoio {
    private String contacto;

    public BalcaoDeApoio(String contacto) {
        this.contacto = contacto;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((contacto == null) ? 0 : contacto.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BalcaoDeApoio other = (BalcaoDeApoio) obj;
        if (contacto == null) {
            if (other.contacto != null)
                return false;
        } else if (!contacto.equals(other.contacto))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "BalcaoDeApoio [contacto=" + contacto + "]";
    }
}
