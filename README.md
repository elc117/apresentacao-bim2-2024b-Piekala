# Abstração Simples - Jogo VALORANT

### Desenvolvedor
**Nome:** [Leonardo Piekala]

Este projeto é uma abstração simples do jogo **VALORANT**, desenvolvido em Java. A proposta é criar uma simulação de interação entre um jogador e suas armas utilizando conceitos de Orientação a Objetos (OO) como **Herança**, **Abstração**, **Encapsulamento** e **Polimorfismo**.

---

## Objetivo

O código simula a interação de um jogador com diferentes tipos de armas (como pistola, faca e bomba "Spyke"). O jogador pode:

- Atacar com armas (Left Click e Right Click)
- Trocar de arma
- Inspecionar as armas

O foco deste projeto é ensinar conceitos de Orientação a Objetos de maneira prática e interativa para iniciantes.

---

## Como Rodar o Código

1. Certifique-se de ter o Java instalado em sua máquina. Você pode baixar o Java [aqui](https://www.java.com).
2. Clone este repositório ou baixe o código.
3. Compile os arquivos `.java`:

   ```bash
   javac Game.java

4. Execute o programa:

   ```bash
   java Game

O jogo será iniciado, e você poderá interagir com o programa por meio de um menu interativo no terminal.

---

## Explicação do Código

O código está estruturado em torno de classes e objetos. Vamos explorar alguns conceitos de Orientação a Objetos (OO) que foram usados.

### 1. Abstração
A abstração é um dos pilares da programação orientada a objetos. Ela permite esconder os detalhes de implementação e mostrar apenas as funcionalidades essenciais.

A classe `Handle` é abstrata e define métodos como `left_click()`, `right_click()`, e `inspect()` que devem ser implementados pelas classes que herdam dela (por exemplo, `Pistol`, `Knife`, `Spyke`).

**Exemplo de código:**

```java
public abstract class Handle {
    protected float weight; // Atributo protegido, acessível em classes que herdam Handle.

    public abstract void left_click(Player player);
    public abstract void right_click(Player player);
    public abstract void inspect(); // Métodos abstratos a serem implementados pelas subclasses.
}
```

### 2. Herança
A herança permite que uma classe herde propriedades e métodos de outra classe. Aqui, a classe `Handle` é a superclasse de outras classes de armas como `Pistol`, `Knife` e `Spyke`. Essas classes herdam atributos e métodos da classe `Handle`, mas também podem ter comportamentos adicionais ou personalizados.

**Exemplo de código:**

```java
public class Pistol extends Handle {
    // A Pistol herda de Handle e pode sobrescrever os métodos.
    @Override
    public void left_click(Player player) {
        // Comportamento da pistola ao clicar com o botão esquerdo.
    }

    @Override
    public void right_click(Player player) {
        // Comportamento da pistola ao clicar com o botão direito.
    }

    @Override
    public void inspect() {
        System.out.println("Inspecionando pistola.");
    }
}
```

### 3. Polimorfismo e Override
O polimorfismo permite que objetos de diferentes classes sejam tratados como objetos de uma classe comum. Isso é útil quando você tem uma hierarquia de classes e quer garantir que um método tenha comportamentos diferentes dependendo do tipo de objeto.

O método `left_click()` é sobrescrito nas classes `Pistol`, `Knife`, e `Spyke`, permitindo que cada tipo de arma tenha um comportamento diferente ao clicar com o botão esquerdo do mouse.

**Exemplo de código:**

```java
public class Knife extends Handle {
    @Override
    public void left_click(Player player) {
        // A faca tem um comportamento específico ao ser clicada com o botão esquerdo
        System.out.println("Golpeando com a faca!");
    }

    @Override
    public void right_click(Player player) {
        // Comportamento específico da faca ao clicar com o botão direito
    }

    @Override
    public void inspect() {
        System.out.println("Inspecionando faca.");
    }
}
```

### 4. Atributos Protegidos
Atributos protegidos são aqueles que podem ser acessados pelas classes que herdam a classe onde o atributo foi declarado. No exemplo, o atributo `weight` da classe `Handle` é protegido, o que permite que as subclasses como `Pistol`, `Knife`, etc., possam acessar e modificar esse valor.

**Exemplo de código:**

```java
public abstract class Handle {
    protected float weight; // Este atributo é acessível em classes filhas

    public abstract void left_click(Player player);
    public abstract void right_click(Player player);
    public abstract void inspect();
}
```

### 5. Métodos e Construtores
Os métodos são funções dentro das classes que definem os comportamentos dos objetos. Por exemplo, `left_click()`, `right_click()`, e `inspect()` são métodos que representam ações que podem ser realizadas com as armas.

Os construtores são usados para inicializar objetos. No caso do `Pistol`, o construtor inicializa a quantidade de munição e os atributos da arma.

**Exemplo de código:**

```java
public class Pistol extends Handle {
    protected ArrayList<Integer> ammo;
    protected float weight;
    protected float weak_speed;

    public Pistol() {
        this.weight = 0.5f;
        this.weak_speed = 0.4f;
        this.ammo = new ArrayList<>();  // Inicializa o ArrayList
        for (int i = 0; i < 5; i++) {
            ammo.add(15);  // Adiciona 15 balas ao carregador
        }
    }

    @Override
    public void left_click(Player player) {
        // Ação de disparar a pistola
    }

    @Override
    public void right_click(Player player) {
        // Ação de outro tipo de interação com a pistola
    }

    @Override
    public void inspect() {
        System.out.println("Inspecionando pistola.");
    }
}
```


### 6. Encapsulamento
O encapsulamento é o princípio de esconder os dados internos de uma classe e fornecer métodos para acessá-los ou modificá-los de maneira controlada. A classe `Player` possui métodos `getLife()`, `setLife()`, `getShield()`, `setShield()`, etc., para acessar e modificar os atributos privados ou protegidos.

**Exemplo de código:**

```java
public class Player {
    private String name;  // Atributo privado
    private int life;     // Atributo privado

    public int getLife() {
        return this.life;  // Método público para acessar o atributo 'life'
    }

    public void setLife(int life) {
        this.life = life;  // Método público para modificar o atributo 'life'
    }
}
    public int getShield() {
        return this.shield; // Método público para acessar o atributo 'shield'
    }

    public void setShield(int shield) {
        this.shield = shield; // Método público para modificar o atributo 'shield'
    }
}
```

### Conclusão
Este projeto fornece uma maneira prática e divertida de aprender os conceitos fundamentais da programação orientada a objetos. Com exemplos claros de herança, abstração, polimorfismo e encapsulamento, o código ajuda a entender como modelar o mundo real com objetos e interações, como em um jogo simples.

Experimente modificar o código, adicionar novas armas ou recursos, e continue aprendendo!

### Bibliografia
Markdown gerado por IA [gepeto] (o autor não conhecia as tags corretamente).  
[Site do jogo VALORANT](https://playvalorant.com)
