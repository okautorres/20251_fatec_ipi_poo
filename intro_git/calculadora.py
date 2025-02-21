import menu

while True:
    op = menu.menu()
    if op == '0':
        print("Saindo...")
        break
    a = float(input("Digite o primeiro número: "))
    b = float(input("Digite o segundo número: "))

    def somar (a,b):
        return a+b

    def subtrair (a,b):
        return a-b

    def multiplicar(a,b):
        return a*b

    def dividir(a,b):
        if(b != 0):
            return a/b
        else:
            return "Erro: Divisão por zero"

    if op == '1':
        resultado = somar(a,b)
    elif op == '2':
        resultado = subtrair(a,b)
    elif op == '3':
        resultado = multiplicar(a,b)
    elif op == '4':
        resultado = dividir(a,b)
    else:
        resultado = "Opção inválida"

    print(f"Resultado: {resultado}")
