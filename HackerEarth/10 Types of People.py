import binascii
s = raw_input()
n = int('0b'+s, 2)
print binascii.unhexlify('%x' % n)