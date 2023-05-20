from functools import reduce

# Задача №47.
# У вас есть код, который вы не можете менять (так часто бывает, когда код в глубине
# программы используется множество раз и вы не хотите ничего сломать):
# transformation = <???>
# values = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29] # или любой другой список
# transormed_values = list(map(transformation, values))
# Единственный способ вашего взаимодействия с этим кодом - посредством задания
# функции transformation.
# Однако вы поняли, что для вашей текущей задачи вам не нужно никак преобразовывать
# список значений, а нужно получить его как есть.
# Напишите такое лямбда-выражение transformation, чтобы transformed_values получился
# копией values.
# Ввод:
# values = [1, 23, 42, ‘asdfg’]
# transformed_values = list(map(trasformation, values))
# if values == transformed_values:
#  print(‘ok’)
# else:
#  print(‘fail’)
# Вывод:
# ok

# values = [1, 23, 42, 'asdfg']
# print(values)
# transformation = lambda x: x
# transformed_values = list(map(transformation, values))
# print(transformed_values)
# if values == transformed_values:
#     print('ok')
# else:
#     print('fail')

# =====================================================================
# =====================================================================

# Задача №49
# Планеты вращаются вокруг звезд по эллиптическим орбитам.
# Назовем самой далекой планетой ту, орбита которой имеет
# самую большую площадь. Напишите функцию
# find_farthest_orbit(list_of_orbits), которая среди списка орбит
# планет найдет ту, по которой вращается самая далекая
# планета. Круговые орбиты не учитывайте: вы знаете, что у
# вашей звезды таких планет нет, зато искусственные спутники
# были были запущены на круговые орбиты. Результатом
# функции должен быть кортеж, содержащий длины полуосей
# эллипса орбиты самой далекой планеты. Каждая орбита
# представляет из себя кортеж из пары чисел - полуосей ее
# эллипса. Площадь эллипса вычисляется по формуле S = pi*a*b,
# где a и b - длины полуосей эллипса. При решении задачи
# используйте списочные выражения. Подсказка: проще всего
# будет найти эллипс в два шага: сначала вычислить самую
# большую площадь эллипса, а затем найти и сам эллипс,
# имеющий такую площадь. Гарантируется, что самая далекая
# планета ровно одна

# Ввод:
# orbits = [(1, 3), (2.5, 10), (7, 2), (6, 6), (4, 3)]
# print(*find_farthest_orbit(orbits))
# Вывод:
# 2.5 10

# orbits = [(1, 3), (2.5, 10), (7, 2), (6, 6), (4, 3)]
# print(orbits)
# # var1
# # def find_farthest_orbit(list_of_orbits):
# #     list_of_orbits = list(filter(lambda x: x[0] != x[1], list_of_orbits))
# #     print(list_of_orbits)
# #     list_of_orbits = reduce(lambda a, b: a if a[0] * a[1] > b[0] * b[1] else b, list_of_orbits)
# #     print(*list_of_orbits)
# # find_farthest_orbit(orbits)

# # var2
# def find_farthest_orbit(list_of_orbits):
#     return max(list_of_orbits, key = lambda x: (x[0] != x[1]) * x[0] * x[1]) # (x[0] != x[1]) - булева переменная, если тру, то она конвертируется в 1, если фалс, то в 0
# print(*find_farthest_orbit(orbits))

# -----------------------  СОРТИРОВКА  -----------------------
# l = [(1,2),(4,3),(5,6)]
# print(sorted(l, key = lambda x: x[0] > x[1] )) # [(1, 2), (5, 6), (4, 3)]

# l = [1,2,4,3,5,6]
# print(sorted(l, reverse=True)) # [6, 5, 4, 3, 2, 1]

# l = [1,2,4,3,5,6]
# print(sorted(l, key=lambda x: x%2==0)) # [1, 3, 5, 2, 4, 6]

# =====================================================================
# =====================================================================

# Задача №51.
# Напишите функцию same_by(characteristic, objects), которая
# проверяет, все ли объекты имеют одинаковое значение
# некоторой характеристики, и возвращают True, если это так.
# Если значение характеристики для разных объектов
# отличается - то False. Для пустого набора объектов, функция
# должна возвращать True. Аргумент characteristic - это
# функция, которая принимает объект и вычисляет его
# характеристику.
# Ввод:                                         Вывод:
# values = [0, 2, 10, 6]                        same
# if same_by(lambda x: x % 2, values):
#   print(‘same’)
# else:
#   print(‘different’)

## def func(x):  # 108 - 109 строка аналогична 114 строке
##    return x % 2 == 0

def same_by(characteristic, objects):
    return len(list(filter(characteristic, objects))) == len(objects)

function = lambda x: x % 2 == 0
values = [0, 2, 10, 6]
if same_by(function, values):
    print('same')
else:
    print('different')
