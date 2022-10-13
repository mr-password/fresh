# !/usr/bin/python

"""
when batch exporting files, inkscape prefixes everything with _ :/
this script removes the _.
"""

import os

for root, dirs, files in os.walk("../sprites-override"):
   for name in files:
      old_path = os.path.join(root, name)
      new_path = os.path.join(root, name.lstrip("_"))
      print(old_path, new_path)
      os.rename(old_path, new_path)
