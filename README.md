# yazilimOrtamFinal

steps:
- uses: actions/checkout@master
- uses: codecov/codecov-action@v1
  with:
    token: $7f431253-a51c-4ff3-b69e-57235ad74685 # not required for public repos
    files: ./coverage1.xml,./coverage2.xml # optional
    flags: unittests # optional
    name: codecov-umbrella # optional
    fail_ci_if_error: true # optional (default = false)
    verbose: true # optional (default = false)
