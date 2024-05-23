def uclid(a,b):
  if b > a:
    a,b = b,a
  if b == 0:
    return a
  return uclid(b,a%b)

print(uclid(270,192))