package service;

import model.NFe;

import java.util.ArrayList;

public class NFeService {

    ArrayList<NFe> listaNfe = new ArrayList<>();

    public void adicionar(NFe nfe) {

        listaNfe.add(nfe);

        System.out.println("NF-e cadastrada com sucesso!");
    }

    public void listar() {

        if (listaNfe.isEmpty()) {

            System.out.println("Nenhuma NF-e cadastrada.");
            return;
        }

        for (NFe nfe : listaNfe) {

            System.out.println(nfe);
        }
    }

    public NFe buscarPorNumero(int numero) {

        for (NFe nfe : listaNfe) {

            if (nfe.getNumero() == numero) {

                return nfe;
            }
        }

        return null;
    }

    public void buscarPorNome(String nome) {

        boolean encontrou = false;

        for (NFe nfe : listaNfe) {

            if (nfe.getCliente().getNome()
                    .equalsIgnoreCase(nome)) {

                System.out.println(nfe);
                encontrou = true;
            }
        }

        if (!encontrou) {

            System.out.println("Nenhuma NF-e encontrada.");
        }
    }

    public void buscarPorCpf(String cpf) {

        boolean encontrou = false;

        for (NFe nfe : listaNfe) {

            if (nfe.getCliente().getCpfCnpj()
                    .equalsIgnoreCase(cpf)) {

                System.out.println(nfe);
                encontrou = true;
            }
        }

        if (!encontrou) {

            System.out.println("Nenhuma NF-e encontrada.");
        }
    }

    public void buscarPorValor(double valor) {

        boolean encontrou = false;

        for (NFe nfe : listaNfe) {

            if (nfe.getValorTotal() == valor) {

                System.out.println(nfe);
                encontrou = true;
            }
        }

        if (!encontrou) {

            System.out.println("Nenhuma NF-e encontrada.");
        }
    }

    public void excluir(int numero) {

        NFe nfe = buscarPorNumero(numero);

        if (nfe != null) {

            listaNfe.remove(nfe);

            System.out.println("NF-e removida com sucesso!");

        } else {

            System.out.println("NF-e não encontrada.");
        }
    }

    public void listarIntervalo(int inicio, int fim) {

        for (NFe nfe : listaNfe) {

            if (nfe.getNumero() >= inicio &&
                    nfe.getNumero() <= fim) {

                System.out.println(nfe);
            }
        }
    }
}