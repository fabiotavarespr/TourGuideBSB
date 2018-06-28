package br.com.fabiotavares.tourguidebsb.domino;

public class PontoTuristico {

    /** Nome referente do ID do ponto turistico */
    private int mNomePontoTuristicoId;

    /** Descricao referente do ID do ponto turistico */
    private int mDescricaoPontoTuristicoId;

    /** Imagem referente do ID do ponto turistico */
    private int mImagemPontoTuristicoId;

    /** Construtor padrão sem parametros */
    public PontoTuristico(){
    }

    /**
     * Construtor com parametros
     *
     * @param nomePontoTuristicoId Este  ID é referente a String com o nome do ponto turistico
     * @param descricaoPontoTuristicoId Este  ID é referente a String com a descricao do ponto turistico
     * @param imagemPontoTuristicoId Este  ID é referente a Imagem do ponto turistico
     */
    public PontoTuristico(int nomePontoTuristicoId, int descricaoPontoTuristicoId, int imagemPontoTuristicoId){
        this.mNomePontoTuristicoId = nomePontoTuristicoId;
        this.mDescricaoPontoTuristicoId = descricaoPontoTuristicoId;
        this.mImagemPontoTuristicoId = imagemPontoTuristicoId;
    }

    /** métodos de acesso Getters e Setters */
    public int getNomePontoTuristicoId() {
        return mNomePontoTuristicoId;
    }

    public void setNomePontoTuristicoId(int nomePontoTuristicoId) {
        this.mNomePontoTuristicoId = nomePontoTuristicoId;
    }

    public int getDescricaoPontoTuristicoId() {
        return mDescricaoPontoTuristicoId;
    }

    public void setDescricaoPontoTuristicoId(int descricaoPontoTuristicoId) {
        this.mDescricaoPontoTuristicoId = descricaoPontoTuristicoId;
    }

    public int getImagemPontoTuristicoId() {
        return mImagemPontoTuristicoId;
    }

    public void setImagemPontoTuristicoId(int imagemPontoTuristicoId) {
        this.mImagemPontoTuristicoId = imagemPontoTuristicoId;
    }

}
