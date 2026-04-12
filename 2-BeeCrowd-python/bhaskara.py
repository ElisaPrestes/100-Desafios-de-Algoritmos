if discriminante <= 0 or a <= 0:
    print("Impossivel calcular")
else:
    delta = math.sqrt(discriminante)
    R1 = ((b*-1) + delta) / (2*a)
    R2 = ((b*-1) - delta) / (2*a)
    print(f'R1 = {R1:.5f}\nR2 = {R2:.5f}')