#Linguagem escolhida - Python

def DonPython(moedas_validas,troco,cont,resp_local):
	for i in range(1,troco+1): # (nome=i, propriedade=valor, tempo=implementação)
		contador=i
		qual_pegar=1 
		for j in moedas_validas:
			if j<=i: 
				if cont[i-j]+1<contador: 
					contador=cont[i-j]+1 
					qual_pegar=j 
			cont[i]=contador 
			resp_local[i]=qual_pegar 
	print(cont[troco]) 

def caminho(resp_local,troco): 
	moedas=[] 
	while troco>0:  # (nome=while, propriedade=função, tempo=compilação)
		devo_pegar_essa=resp_local[troco] 
		moedas.append(devo_pegar_essa) 
		troco=troco-devo_pegar_essa 
	print(moedas) 
	
	
quantia=68
moedas=[100,50,25,10,5,1]  # (nome=moedas, propriedade=array, tempo=execução)
resp_local=[0]*(quantia+1)
contador=[0]*(quantia+1) 


DonPython(moedas,quantia,contador,resp_local) # (nome=DonPython, propriedade=função, tempo=carregamento)
caminho(resp_local,quantia) 