package Ex71;

public class AgenciaViagens {
    private String nome, endereço;
    static Alojamento[] alojamentos = new Alojamento[0];
    static Carro[] carros = new Carro[0];

    public AgenciaViagens(String nome, String endereço){
        this.nome=nome;
        this.endereço=endereço;
    }

    public Alojamento getClass(String id){
        for(Alojamento al: alojamentos){
            if (al.getNome().equals(id) || al.getCodigo().equals(id))
                return al;
        }
        return null;
    }

    public String filtrar(int i, String a){
        String out="";
        for(Alojamento al: alojamentos){
            switch(i){
                case(1):
                    if(al instanceof Apartamento)
                        out+="\n\tApartamento: "+al.getCodigo()+" | "+al.getNome();
                    break;
                case(2):
                    if(al instanceof QuartoHotel)
                        out+="\n\tQuarto de Hotel: \n\t"+al.getCodigo()+" | "+al.getNome();
                    break;
                case(3):
                    if(al.getDisponibilidade()==true)
                        out+="\n\tAlojamento: "+al.getCodigo()+" | "+al.getNome();
                    break;
                case(4):
                    if(al.getPrecoPorNoite()>=Double.parseDouble(a))
                        out+="\n\tAlojamento: "+al.getCodigo()+" | "+al.getNome()+" | "+al.getPrecoPorNoite();
                    break;
                case(5):
                    if(al.getPrecoPorNoite()<=Double.parseDouble(a))
                        out+="\n\tAlojamento: "+al.getCodigo()+" | "+al.getNome()+" | "+al.getPrecoPorNoite();
                    break;
                case(6):
                    if(al.getAvaliacao()>=Double.parseDouble(a))
                        out+="\n\tAlojamento: "+al.getCodigo()+" | "+al.getNome()+" | "+al.getAvaliacao();
                    break;
                case(7):
                    if(al.getAvaliacao()>=Double.parseDouble(a))
                        out+="\n\tAlojamento: "+al.getCodigo()+" | "+al.getNome()+" | "+al.getAvaliacao();
                    break;
                case(8):
                    if(al instanceof Apartamento){
                        if(al.getNumeroQuartos()>=Integer.parseInt(a))
                            out+="\n\tApartamento: "+al.getCodigo()+" | "+al.getNome()+" | "+al.getNumeroQuartos();
                    }
                    break;
                case(9):
                    if(al instanceof QuartoHotel){
                        if(al.getTipo().equals(a))
                            out+="\n\tQuarto de Hotel: "+al.getCodigo()+" | "+al.getNome()+" | "+al.getTipo();
                    }
                    break;
            }
        }
        return out;
    }

    public String filtrarCarros(int i, String a){
        String out="";
        for(Carro ca: carros){
            switch(i){
                case(1):
                    if(ca.getDisponibilidade()==true)
                        out+="\n\t"+ca.getCodigo();
                    break;
                case(2):
                    if(ca.getClasse()==a.charAt(0))
                        out+="\n\t"+ca.getCodigo();
                    break;
                case(3):
                    if(ca.getCombustivel().equals(a))
                        out+="\n\t"+ca.getCodigo();
                    break;
            }
        }
        return out;
    }

    public String editar(String id, int i, String m){
        Alojamento a = null;
        String r = "ERRO";
        for(Alojamento al: alojamentos){
            if (al.getCodigo().equals(id) || al.getNome().equals(id)){
                a=al;
                if (al instanceof Apartamento)
                    i = 4;
                else
                    i = 5;
                switch(i){
                    case(1):
                        a.setNome(m);
                        break;
                    case(2):
                        a.setPrecoPorNoite(Double.parseDouble(m));
                        break;
                    case(3):
                        a.setAvaliacao(Double.parseDouble(m));
                        break;
                    case(4):
                        a.setNumeroQuartos(Integer.parseInt(m));
                        break;
                    case(5):
                        a.setTipo(m);
                        break;
                }
                r = "\n|Alojamento Editado|";
                break;
            }
        }
        return r;
    }

    public String editarCarro(String id, int i, String m){
        Carro c = null;
        String r = "ERRO";
        for(Carro ca: carros){
            if (ca.getCodigo().equals(id)){
                c=ca;
                switch(i){
                    case(1):
                        c.setClasse(m.charAt(0));
                        break;
                    case(2):
                        c.setCombustivel(m);
                        break;
                }
                r = "\n|Carro Editado|";
                break;
            }
        }
        return r;
    }

    public String checkIn(String id){
        String out="";
        for(Alojamento al: alojamentos){
            if (al.getCodigo().equals(id) || al.getNome().equals(id))
                if (al.getDisponibilidade()==true){
                    al.setDisponibilidade(false);
                    out+=("\nCheck-In realizado com sucesso! "+id);
                }
                else
                    out+="\nCheck-In falhou!";
            break;
        }
        return out;
    };

    public String checkOut(String id){
        String out="";
        for(Alojamento al: alojamentos){
            if (al.getCodigo().equals(id) || al.getNome().equals(id))
                if (al.getDisponibilidade()==false){
                    al.setDisponibilidade(true);
                    out+=("\nCheck-Out realizado com sucesso! "+id);
                }
                else
                    out+="\nCheck-Out falhou!";
            break;
        }
        return out;
    };

    public String alugar(String id){
        String out="";
        for(Carro c: carros){
            if (c.getCodigo().equals(id))
                if (c.getDisponibilidade()==true){
                    c.setDisponibilidade(false);
                    out+=("\nAluguer realizado com sucesso! "+id);
                }
                else
                    out+="\nAluguer falhou!";
            break;
        }
        return out;
    };

    public String devolver(String id){
        String out="";
        for(Carro c: carros){
            if (c.getCodigo().equals(id))
                if (c.getDisponibilidade()==false){
                    c.setDisponibilidade(true);
                    out+=("\nDevolucao realizada com sucesso! "+id);
                }
                else
                    out+="\nDevolucao falhou!";
            break;
        }
        return out;
    };

    public void registarPessoa(String id, String p, int s){
        switch(s){
            case(1):
                for(Alojamento al: alojamentos){
                    if (al.getCodigo().equals(id) || al.getNome().equals(id))
                        al.setPessoa(p);
                }
                break;
            case(2):
                for(Carro c: carros){
                    if (c.getCodigo().equals(id))
                        c.setPessoa(p);
                }
                break;
        }
    }

    public void adicionar(String codigo, String nome, String local, double precoPorNoite, double avaliacao, int numeroQuartos){
        Alojamento al = new Apartamento(codigo, nome, local, precoPorNoite, avaliacao, numeroQuartos);
        listar(al);
    };

    public void adicionar(String codigo, String nome, String local, double precoPorNoite, double avaliacao, String tipo){
        Alojamento al = new QuartoHotel(codigo, nome, local, precoPorNoite, avaliacao, tipo);
        listar(al);
    };

    public void adicionar(String codigo, char classe, String combustivel){
        Carro c = new Carro(codigo, classe, combustivel);
        listar(c);
    };

    public void removerAlojamento(String id){
        if (alojamentos.length>0){
            Alojamento[] nal = new Alojamento[alojamentos.length-1];
            int e = 0;
            for(int i=0; i<alojamentos.length; i++)
                if (!(alojamentos[i].getCodigo().equals(id) || alojamentos[i].getNome().equals(id))){
                    nal[e]=alojamentos[i];
                    e++;
                }
            alojamentos=nal;
        }
    }

    public void removerCarro(String id){
        if (carros.length>0){
            Carro[] nca = new Carro[carros.length-1];
            int e = 0;
            for(int i=0; i<carros.length; i++)
                if (!(carros[i].getCodigo().equals(id))){
                    nca[e]=carros[i];
                    e++;  
                }
            carros=nca;
        }
    }

    public void listar(Alojamento al){
        Alojamento[] nal = new Alojamento[alojamentos.length+1];
        if (alojamentos.length>0){
            for(int i=0; i<alojamentos.length; i++)
                nal[i]=alojamentos[i];
            nal[nal.length-1]=al;
        }
        else 
            nal = new Alojamento[]{al};
        alojamentos=nal;     
    }

    public void listar(Carro c){
        Carro[] nca = new Carro[carros.length+1];
        if (carros.length>0){
            for(int i=0; i<carros.length; i++)
                nca[i]=carros[i];
            nca[nca.length-1]=c;
        }
        else
            nca = new Carro[]{c};
        carros=nca;
    }

    public void limparAlojamentos(){
        alojamentos = new Alojamento[0];
    }

    public void limparCarros(){
        carros = new Carro[0];
    }
    
    public String getAlojamentos(){
        String out="\n";
        for(Alojamento al: alojamentos)
            out+="\t"+al.getCodigo()+" | "+al.getNome()+"\n";
        return out;
    }
    public String getAlojamentoInfo(String id){
        for(Alojamento al: alojamentos){
            if (al.getCodigo().equals(id) || al.getNome().equals(id))
                return al.toString();
        }
        return null;
    }
    public String getCarroInfo(String id){
        for(Carro ca: carros){
            if (ca.getCodigo().equals(id))
                return ca.toString();
        }
        return null;
    }
    public String getCarros(){
        String out="\n";
        for(Carro c: carros)
            out += "\t"+c.getCodigo()+"\n";
        return out;
    }

    public String getNome() {return nome;}
    public String getEndereço() {return endereço;}

    public void setNome(String nome) {this.nome = nome;}
    public void setEndereço(String endereço) {this.endereço = endereço;}

    @Override
    public String toString(){return "Agência: "+this.nome+", Endereço:  "+this.endereço;}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((endereço == null) ? 0 : endereço.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
        AgenciaViagens other = (AgenciaViagens) obj;
        if (endereço == null) {
            if (other.endereço != null)
                return false;
        } else if (!endereço.equals(other.endereço))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }

}
