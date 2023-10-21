package br.com.fiap.arrays;

public class Products {
    String name;
    String description;
    float value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Produto [nome = " + name + ", descrição = " + description + ", valor = " + value + "]";
    }
}
