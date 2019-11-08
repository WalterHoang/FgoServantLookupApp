import { TestBed } from '@angular/core/testing';

import { ServantsService } from './servants.service';

describe('ServantsService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ServantsService = TestBed.get(ServantsService);
    expect(service).toBeTruthy();
  });
});
